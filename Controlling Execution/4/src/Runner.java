public class Runner {
    public static void main(String[] args) {
        System.out.println("Prime numbers is: ");
        for (int i = 1; i <= 50; i++)
        {
            int count=0;
            for(int j = i; j >= 1; j--)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.print(i + " ");
            }
        }
    }
}
