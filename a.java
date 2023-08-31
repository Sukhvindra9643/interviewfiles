class a {
    // list first = [1,2,3]
    // list second = [3,4,5]
    public static void main(String[] args) {
        int first[] = { 1, 2, 3 };
        int second[] = { 3, 4, 5 };

        int result[] = new int[first.length + second.length];
        boolean duplicate = false;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    duplicate = true;
                }
            }
        }
        for(int i=0;i<first.length;i++){
            result[i] = first[i];
        }
        for(int i=0;i<second.length;i++){
            result[first.length+i] = second[i];
        }
        if(duplicate){
            System.out.println("Duplicate element found");
        }
        System.out.println(duplicate);
        System.out.println(result);
    }

}