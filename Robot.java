

public class Robot {
    String name;// создаем поля класса робот
    String creatorRobot;
    static int x;
    static int y;
    static Direction direction;

    enum Direction {UP, DOWN, RIGHT, LEFT}

    // создаю 2 конструктора для обьекта класса робот
    public Robot() {
        this.name = "Valli";
        this.x = 0;
        this.y = 0;
        this.creatorRobot = "Test";
        direction = Direction.UP;
    }

    public Robot(String name, int x, int y, String creatorRobot, Direction directionRobot) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.creatorRobot = creatorRobot;
        direction = directionRobot;
    }

    // создаю методы класса робот
    int getY() {
        /// возвращает из обекта текущее значение у
        return this.y;
    }

    int getX() {
        /// возвращает из обекта текущее значение
        return this.x;
    }

    void stepForward() {
        /// запрашивает направление взгляда робота и выбирает координату для изменения
        int tempUpDown = getY();
        int tempLeftRight = getX();
        switch (direction) {
            case UP:
                Robot.y = tempUpDown + 1;
                break;
            case DOWN:
                Robot.y = tempUpDown - 1;
                break;
            case LEFT:
                Robot.x = tempLeftRight - 1;
                break;
            case RIGHT:
                Robot.x = tempLeftRight + 1;
        }
    }

    void getDirection() {
        /// выводит направление взгляда, позицию и создателя
        System.out.println("НАПРАВЛЕНИЕ ДВИЖЕНИЯ " + direction);
        int x = getX();
        int y = getY();
        System.out.println("Позиция робота X = " + x + " Y = " + y + " Робот создан " + creatorRobot);
    }

    void turnLeft() {
        ///запрашивает направление взгляда и поаорачивает налево
        System.out.println("ПОВОРАЧИВАЮ НАЛЕВО");
        switch (direction) {
            case RIGHT:
                Robot.direction = Direction.UP;
                break;
            case LEFT:
                Robot.direction = Direction.DOWN;
                break;
            case UP:
                Robot.direction = Direction.LEFT;
                break;
            case DOWN:
                Robot.direction = Direction.RIGHT;
        }
    }

    void turnRight() {
        ///запрашивает направление взгляда и поаорачивает направо
        System.out.println("ПОВОРАЧИВАЮ НАПРАВО");
        switch (direction) {
            case RIGHT:
                Robot.direction = Direction.DOWN;
                break;
            case LEFT:
                Robot.direction = Direction.UP;
                break;
            case UP:
                Robot.direction = Direction.RIGHT;
                break;
            case DOWN:
                Robot.direction = Direction.LEFT;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Направление взгляда ");
        robot.getDirection();// start position + creator
        if (robot.x == toX && robot.y == toY) {
            System.out.println("Робот " + robot.name + " уже Здесь!!!");
            robot.getDirection();
        }
        while ((robot.x <= toX) && (robot.y <= toY)) {
            if ((robot.x == toX)&&(robot.y == toY)){
                System.out.println("Робот " + robot.name + " прибыл в место назначения");
                System.out.println("Робот создан " + robot.creatorRobot);
                break;
            }
            if (robot.x < toX) {
                switch (direction) {
                    case DOWN:
                        robot.turnLeft();
                        robot.stepForward();
                        robot.getDirection();
                        break;
                    case UP:
                        robot.turnRight();
                        robot.stepForward();
                        robot.getDirection();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.stepForward();
                        robot.getDirection();
                        break;
                    case RIGHT:
                        robot.stepForward();
                        robot.getDirection();
                        break;
                }
            } else if (robot.y < toY) {
                switch (direction) {
                    case DOWN:
                        robot.turnRight();
                        robot.getDirection();
                        break;
                    case UP:
                        robot.stepForward();
                        robot.getDirection();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.stepForward();
                        robot.getDirection();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        robot.stepForward();
                        robot.getDirection();
                        break;

                }
            }else {
                System.out.println("---Message Robot ---" + robot.name + "' Я ЗАБЛУДИЛСЯ'");
            }
        }

    }

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot("Ark'550'", 5, 10, "MAXIR", Direction.DOWN);
        moveRobot(robot1, 55, 19);

    }
}
