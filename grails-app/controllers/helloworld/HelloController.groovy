package helloworld

class HelloController {
    def load() {
        render "load" + FindPrimeNumber(100000)
    }
    def index() {
        render "Hello World!!"
    }
public long FindPrimeNumber(int n)
{
    int count=0;
    long a = 2;
    while(count<n)
    {
        long b = 2;
        int prime = 1;// to check if found a prime
        while(b * b <= a)
        {
            if(a % b == 0)
            {
                prime = 0;
                break;
            }
            b++;
        }
        if(prime > 0)
        {
            count++;
        }
        a++;
    }
    return (--a);
}
}
