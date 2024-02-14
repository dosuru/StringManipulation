//import java.io.*;
//import java.util.*;
//
//public class Player {
//	String name;
//	int score;
//
//	Player(String name, int score) {
//		this.name = name;
//		this.score = score;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getScore() {
//		return score;
//	}
//
//	public void setScore(int score) {
//		this.score = score;
//	}
//
//	@Override
//	public String toString() {
//		return "Player [name=" + name + ", score=" + score + "]";
//	}
//
//	public static void main(String[] args) {
//		List<Player> list = new ArrayList<Player>();
//		list.add(new Player("Tulasi", 23));
//		list.add(new Player("prasad", 20));
//		list.add(new Player("subbu", 25));
//		list.add(new Player("naidu", 25));
//		list.add(new Player("ravi", 30));
//
//		Collections.sort(list, new ScoreComparator());
//		for (Player pr : list) {
//			System.out.println(pr);
//
//		}
//
//	}
//}
//
//class ScoreComparator implements Comparator<Player> {
//
//	@Override
//	public int compare(Player p1, Player p2) {
//		if (p1.getScore() < p2.getScore()) {
//			return 1;
//		} else if (p1.getScore() > p2.getScore()) {
//			return -1;
//		} else {
//			return p1.getName().compareToIgnoreCase(p2.getName());
//
//		}
//
//	}
//}
import java.io.*;
import java.util.*;

public class Player {
    String name;
    int score;
    Player(String name,int score){
        this.name=name;
        this.score=score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", score=" + score + "]";
    }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         List<Player> list = new ArrayList<Player>();
         for(int i =0;i<n;i++){
            
             String s = sc.next();
             int a = sc.nextInt();
             list.add(new Player(s,a));
         }
        //  list.add(new Player("Tulasi",23));
        //  list.add(new Player("prasad",20));
        //  list.add(new Player("naidu",25));
        //  list.add(new Player("subbu",25));
        //  list.add(new Player("ravi",30));
         
         Collections.sort(list, new ScoreComparator());
         for(Player pr:list){
             System.out.println(pr);
             
         }
        
    }
}
class ScoreComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1,Player p2){
        if(p1.getScore()<p2.getScore()){
            return 1;
        }
        else if(p1.getScore()>p2.getScore()){
            return -1;
        }
        else{
            return p1.getName().compareToIgnoreCase(p2.getName());
        }
        
    }
}


   
