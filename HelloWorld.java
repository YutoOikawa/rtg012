class HelloWorld{
    public static void main(String args[]){

        double score = Math.floor(Math.random() * 100);
        final String message;

        if(score < 30){
            message = score + "点です。追試決定です。";
        }else if(30 <= score && score <= 80){
            if(score <= 50){message = score + "点です。可です。\n" + "でもギリギリ";}
            else if (51 <= score && score <= 70){message = score + "点です。可です。\n" + "この調子で";}
            else {message = score + "点です。可です。\n" + "もう一歩で";}
            
        }else{
            message = score + "点です。非常に優秀です。";
        }

        System.out.println(message);

    }
}