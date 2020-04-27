package lessons.lesson01.Iterations.BinaryGap;

public class sjjyy {
    public static int solution(int n)
    {
        int gap = 0;
        int temp = 0;
        
        if (n == 1)
            return 0; // 1 = 0
        
        char binary[] = Integer.toBinaryString(n).toCharArray(); // binary로 변환 후 char[] 배열 생성
        
        for (int x = 0; x < binary.length; x++)
        {
            if(binary[x] == '0')
            {
                temp++; // count 0
                continue;
            }
            else if(binary[x] == '1') // end
            {
                if(temp > gap)
                gap = temp;
                temp = 0;
            }
        }
        return gap;
    }

    public static void main(String[] args) {
        System.out.println(solution(32) == 0);
        System.out.println(solution(1041) == 5);
        System.out.println(solution(9) == 2);
        System.out.println(solution(529) == 4);
        System.out.println(solution(20) == 1);
        System.out.println(solution(15) == 0);
    }
}
