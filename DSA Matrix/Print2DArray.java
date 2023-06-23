class Print2DArray {
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int arr[][] = {{45,85,96,84},
                        {56,85,74,99}};
        print(arr);
    }
}
