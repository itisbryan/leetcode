class ValidMount {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(validMountainArray(arr)); 
    }

    public static boolean validMountainArray(int[] arr) {
        return isStrict(arr, 0, 10); 

    }

    private static boolean isStrict(int[] arr, int max, int min) {
        boolean swapped = false;
        int posCenter = (arr.length -1) / 2;
        for(var i = 1; i < posCenter; i++) {
            for (var j = ) 
        }
        return false;
    }
}
