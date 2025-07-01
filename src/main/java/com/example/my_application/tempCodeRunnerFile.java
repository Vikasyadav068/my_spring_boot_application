 public static String hellosum(@RequestParam int name1, @RequestParam int name2) {
        int sum = name1 + name2;
        return "<h1>Result of " + name1 + " and " + name2 + " is: " + sum + "!</h1>";

} 