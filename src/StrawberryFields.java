public class StrawberryFields {

    //Escribe un programa que permita imprimir la canción Strawberry Fields Forever con un bucle. Solo puedes tener 2 funciones, una que imprima los versos y otra que imprima el coro.
    //Busca información sobre bucles anidados.
    //Al final está la letra completa


    public static void main(String[] args) {
        String[] chorus = {
                "Let me take you down",
                "'Cause I'm going to strawberry fields",
                "Nothing is real",
                "And nothing to get hung about",
                "Strawberry fields forever"};

        playChorus(chorus);
        playVersus(0);
        playChorus(chorus);
        playVersus(1);
        playChorus(chorus);
        playVersus(2);
        playChorus(chorus);

    }

    /**
     * Function name: playVersus
     * 
     * @param number (int)
     * 
     * Inside the function:
     * 1. print versus according the position number
     */
    static void playVersus( int number){
        String[][] versus = {
                {"Living is easy with eyes closed",
                        "Misunderstanding all you see",
                        "It's getting hard to be someone, but it all works out",
                        "It doesn't matter much to me"},
                {"No one I think is in my tree",
                        "I mean, it must be high or low",
                        "That is, you can't, you know, tune in, but it's alright",
                        "That is, I think it's not too bad"},
                {"Always, no sometimes, think it's me",
                        "But you know, I know when it's a dream",
                        "I think I know, I mean a yes",
                        "But it's all wrong",
                        "That is, I think I disagree"}
        };
        for (int i = 0; i < 4; i++) {
            System.out.println(versus[number][i]);
        }
        System.out.println();
    }

    /**
     * Function name: playChorus
     * 
     * Inside the function:
     * 1. print chorus 
     */
    static void playChorus( String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

}


/* 
Strawberry Fields Forever

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Living is easy with eyes closed
Misunderstanding all you see
It's getting hard to be someone, but it all works out
It doesn't matter much to me

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

No one I think is in my tree
I mean, it must be high or low
That is, you can't, you know, tune in, but it's alright
That is, I think it's not too bad

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Always, no sometimes, think it's me
But you know, I know when it's a dream
I think I know, I mean a yes
But it's all wrong
That is, I think I disagree

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
*/