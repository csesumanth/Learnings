package flocareer.mindtree;

class CheckConvergence{

    static void printConvergeNumber(int n)
    {
        int steps = 0;
        boolean converge = true;
        while (n != 1)
        {
            steps++;
            if ((n & 1) == 1)
                n = 3 * n + 1;
            else
                n = n / 2;
            if(steps>=100){
                converge = false;
                break;
            }
        }
        if(converge){
            System.out.print("n" + "is converged to 1"+ "with steps =" + steps);
        }
    }


    public static void main(){
        for(int i=10;i<=1000;i++) {
            printConvergeNumber(i);
        }
    }
}
