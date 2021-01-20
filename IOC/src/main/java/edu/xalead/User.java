package edu.xalead;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    //List集合
    private List<String> photos;
    //Array集合
    private String[] friends;
    //Set集合
    private Set<String> money;
    //Map集合
    private Map<String,String> map;
    //Properties集合
    private Properties prop;
}
