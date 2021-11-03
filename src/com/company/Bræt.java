package com.company;

public class Bræt {
    int brætstørrelse = 4;
    Felt [] række1 = new Felt[brætstørrelse];
    Felt [] række2 = new Felt[brætstørrelse];
    Felt [] række3 = new Felt[brætstørrelse];
    Felt [] række4 = new Felt[brætstørrelse];

    void init(){

        for (int i = 0; i < række1.length; i++) {
            Felt f = new Felt();
            f.x = i;
            f.y = 0;
            række1[i] = f;

            Felt f1 =new Felt();
            f1.x = i;
            f1.y = 1;
            række2[i] = new Felt();


            række3[i] = new Felt();
            række4[i] = new Felt();

        }
    }




    void visBræt(){
        for (Felt f : række1){
            System.out.print(f.symbol + "  ");
        }
        System.out.println();
        for (Felt f : række2){
            System.out.print(f.symbol + "  ");
        }
        System.out.println();
        for (Felt f : række3){
            System.out.print(f.symbol + "  ");
        }
        System.out.println();
        for (Felt f : række4){
            System.out.print(f.symbol + "  ");
        }

    }

}
