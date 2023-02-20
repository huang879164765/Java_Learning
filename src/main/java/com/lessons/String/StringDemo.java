package com.lessons.String;

public class StringDemo {
    public static void main(String[] args) {
        /*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String str = "abcdefg";
        str = str.substring(2,5).toUpperCase();
        char char0 = str.charAt(0);
        char char1 = str.charAt(1);
        char char2 = str.charAt(2);
        char1 = 'M';
        char2 = 'M';
        char[] chars = {char0, char1, char2};
        str = new String(chars);

        System.out.println(str);
    }
}
