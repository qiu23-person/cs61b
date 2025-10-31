public class BreakContinue {
    public static void windowPosSum(int[] m,int n){
          for(int i=0;i<m.length;i++){
              if(m[i]<0) continue;
              else{
                      //n=3,加上后面3个
                      for(int j=0;j<n ;j++){
                          if(i+j+2>m.length) break;
                          else {
                              m[i] += m[i + 1 + j];
                          }
                      }

                  }
              }

          }
    public static void main(String[] args){
        // int[] a={1, 2, -3, 4, 5, 4};
        int[] a = {1, -1, -1, 10, 5, -1};
        int n=2;
      windowPosSum(a,n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
