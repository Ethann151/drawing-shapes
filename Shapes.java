public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
Turtle turtle = new Turtle();
turtle.forward(100);
turtle.left(120);
turtle.forward(100);
turtle.left(120);
turtle.forward(100);
turtle.left(120);
turtle.right(90);
turtle.forward(100);
        // Task 2: Draw a regular shape many times
for (int i = 0; i<=13; i++) {
turtle.forward(5);
turtle.right(90);
turtle.forward(5);
turtle.right(90);
turtle.forward(5);
turtle.right(90);
turtle.forward(5);
turtle.right(90);

turtle.forward(3);
turtle.right(7);
turtle.forward(3);
turtle.right(7);
turtle.forward(3);
turtle.right(7);
turtle.forward(3);
turtle.right(7);
turtle.forward(5);
}
        // Task 3: How many times does Turtle turn!
int rotation = 0;
turtle.forward(50);
for (int i = 0; i<=13; i++) {
turtle.forward(5);
turtle.right(90);
rotation += 90;
turtle.forward(5);
turtle.right(90);
rotation += 90;
turtle.forward(5);
turtle.right(90);
rotation += 90;
turtle.forward(5);
turtle.right(90);
rotation += 90;

turtle.forward(3);
turtle.right(7);
rotation += 7;
turtle.forward(3);
turtle.right(7);
rotation += 7;
turtle.forward(3);
turtle.right(7);
rotation += 7;
turtle.forward(3);
turtle.right(7);
rotation += 7;
turtle.forward(5);
}
int totalTurns = rotation/360;
System.out.println("Your Turtle has turned "+totalTurns+" times!");
        // Extension 1:
turtle.forward(-100);
for (int a = 0; a<=5; a++) {
for (int b = 0; b<=5; b++) {
turtle.right(10);
for (int i = 0; i<=4; i++) {
turtle.forward(5);
turtle.right(90);
}
turtle.right(10);
}


        // Extension 2:

    }
}
