package Core.MVP;

import Core.Models.Animal;

public interface View {
    String setClass();
    String getName();
    void setName(String value);
    String getBirthday();
    void setBirthday(String value);
    String getCommands();
    void setCommands(String value);   
    void setAnimal(String name, String birthday, String commands); 
}
