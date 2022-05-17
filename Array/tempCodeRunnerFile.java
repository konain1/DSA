 // public static void oneDto2D(int [][] arr , int [] onedi){

    //     int n = arr.length;
    //     int m = arr[0].length;

    //     int s = 2;

    //     int minr = s-1;  // 1
    //     int maxr = n-s;  // 3
    //     int minc= s-1;   // 1
    //     int maxc = m-s;  // 5
        
    //     // int a = minr + maxr -1;   //1 + 3 = 4-1 =3
    //     // int b = minc + maxc -1;   // 1 + 5 = 6-1 = 5
    //     // int c = maxr + minr -1;    // 3 + 1  = 4-1=3
    //     // int d = maxc + minc -1;    // 5 + 1 = 6-1= 5
        


    //     int idx = 0;

    //     for(int i = minr;i<=maxr;i++){
    //         arr[i][minc] = onedi[idx];
    //         idx++;
    //     }
    //     minc++;

    //     for(int i = minc;i<=maxc;i++){
    //         arr[maxr][i]= onedi[idx];
    //         idx++;
    //     }
    //     maxr--;

    //     for(int i = maxr;i>=minr;i--){
    //         arr[i][maxc] = onedi[idx] ;
    //         idx++;
    //     }maxc--;

    //     for(int i= maxc;i>=minc;i--){
    //          arr[minr][i]=onedi[idx];
    //         idx++;
    //     }
    //     minr++;
    // }