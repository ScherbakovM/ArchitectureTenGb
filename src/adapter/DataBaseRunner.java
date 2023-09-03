package adapter;

import adapter.AdapterJavaToDataBase;
import adapter.DataBase;

public class DataBaseRunner {

    public static void main(String[] args) {

        DataBase database = new AdapterJavaToDataBase();

        database.insert();
        database.update();
        database.remove();
        database.select();
    }
}
