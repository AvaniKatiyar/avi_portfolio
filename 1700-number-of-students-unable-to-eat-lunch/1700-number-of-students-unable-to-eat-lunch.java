class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue <Integer> stud= new LinkedList<>();
        for(int stu:students)
        {
            stud.add(stu);
        }
        int hungry=0;int j=0;
        while(hungry<students.length && !stud.isEmpty())
        {
            if(stud.peek()==sandwiches[j])
            {
                j++;
                stud.poll();
                hungry=0;
            }
            else {
                stud.add(stud.poll());
                hungry++;
            }
        }
        return stud.size();
    }
}