import java.util.PriorityQueue;

public class PQforObjects {
    static class Student  implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Rohith", 1));
        pq.add(new Student("Pritish", 5));
        pq.add(new Student("Sandeep", 3));
        pq.add(new Student("Ramesh", 2));
        pq.add(new Student("Suresh", 4));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " : " + pq.peek().rank);
            pq.remove();
        }

    }
}
