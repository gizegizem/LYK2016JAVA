package tr.org.linux.kamp2016.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserTest {
public static void main(String[] args) {
	
	List<User> userList = new ArrayList<>();
	
	User u1 =new User("John",13);
	User u2 =new User("Ahmet",13);
	User u3 =new User("Ayşe",13);
	User u4 =new User("John",24);
	User u5 =new User("Mary",22);
	User u6 =new User("Marry",22);
	
	userList.add(u1);
	userList.add(u2);
	userList.add(u3);
	userList.add(u4);
	userList.add(u5);
	userList.add(u6);
	
	Collections.sort(userList);
	int index=0;
	for(User user : userList){
		System.out.print(userList.get(index).getAge()+"  ");
		System.out.println(userList.get(index).getName());
		index++;
	}
	
}




}
