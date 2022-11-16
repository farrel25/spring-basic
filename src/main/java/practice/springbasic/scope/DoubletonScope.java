package practice.springbasic.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);
    private Long counter = -1L;

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        counter++;
        // kalo objects size nya 2 yg artinya udah full karena ada 2 object yg udah dibuat, kita akan ambil object nya dari counter mod 2
        if (objects.size() == 2) {
            int index = (int) (counter % 2);
            return objects.get(index);
        } else {
            // kalo ternyata object nya belum 2, maka kita bikin object nya. Cara ngebuatnya, kita pakai objectFactory.getObject() . Nanti dia akan membuat object di bean nya
            Object object = objectFactory.getObject();

            // masukkan object ke arraylist
            objects.add(object);

            return object;
        }
    }

    @Override
    public Object remove(String s) {
        //if (objects.size() != 0) {
        if (!objects.isEmpty()) {
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
