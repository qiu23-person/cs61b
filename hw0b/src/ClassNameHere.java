public class ClassNameHere {
    //返回数组中的最大值，所有元素大小>=0
    public static int max(int[] m){
        int temp=m[0];
        //在java中获取数组长度的变量是length
        for(int i=0;i<m.length;i++){
            if(temp<m[i]){
                temp=m[i];
            }
        }

        return temp;
    }
    public static void main(String arg[]){
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6,77};
        //打印最大值
        int max=max(numbers);
        System.out.println("该数组中的最大值是:"+max);
    }

}
