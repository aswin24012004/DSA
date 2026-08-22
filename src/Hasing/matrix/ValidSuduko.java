package matrix;

import java.util.HashMap;

public class ValidSuduko {

    public static void main(String[] args) {
        String[][] board = {
                {"5","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}
        };

        System.out.println(solution(board));
    }

    static boolean solution(String[][] board) {

        HashMap<String,Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!board[i][j].equals(".")) {
                    String row = "row"+i+ "-" + board[i][j];
                    String col = "col" +j+ "-"+ board[i][j];
                    String box = "box" + (i/3) + (j/3) + " - " + board[i][j];

                    map.put(row, map.getOrDefault(row,0)+1);
                    map.put(col, map.getOrDefault(col,0)+1);
                    map.put(box, map.getOrDefault(box,0)+1);

                    if(map.get(row)>1 || map.get(col)>1 || map.get(box)>1) {
                        return false;
                    }
                }
                else {
                    count++;
                    continue;
                }
            }


            System.out.println(map);
            System.out.println(count);
        }
        return true;
    }
}


/*
* "C:\Program Files\jdk-24\bin\java.exe" "-javaagent:D:\java\IntelliJ IDEA Community Edition 2025.2.1\lib\idea_rt.jar=51190" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "D:\Learn Java\learning\out\production\learning" matrix.ValidSuduko
{box3box00=1, box7box01=1, row7=1, col7=1, col5=1, box5box00=1, row3=1, col3=1, row5=1}
{box9box01=1, box3box00=1, row1=1, row7=1, box5box01=1, row6=1, row9=1, box5box00=1, row3=1, row5=2, box1box01=1, box7box01=1, col9=1, col6=1, col7=1, col5=2, col3=1, box6box00=1, col1=1}
{box9box01=1, box3box00=1, row1=1, box9box00=1, row7=1, box5box01=1, row6=2, row9=2, box5box00=1, row8=1, row3=1, row5=2, box1box01=1, box7box01=1, col8=1, col9=2, box8box00=1, col6=2, col7=1, col5=2, col3=1, box6box02=1, box6box00=1, col1=1}
{box3box12=1, box5box01=1, box5box00=1, box8box10=1, col8=2, col9=2, col6=3, col7=1, col5=2, col3=2, box6box02=1, box6box00=1, col1=1, box9box01=1, box3box00=1, row1=1, box9box00=1, row7=1, row6=3, row9=2, row8=2, row3=2, row5=2, box1box01=1, box7box01=1, box8box00=1, box6box11=1}
{box3box11=1, box3box12=1, box5box01=1, box5box00=1, box1box12=1, box8box10=1, box4box10=1, col8=3, col9=2, box8box11=1, col6=3, col7=1, col4=1, col5=2, col3=3, box6box02=1, box6box00=1, col1=2, box9box01=1, box3box00=1, row1=2, box9box00=1, row7=1, row6=3, row9=2, row8=3, row3=3, row5=2, row4=1, box1box01=1, box7box01=1, box8box00=1, box6box11=1}
{box3box11=1, box3box12=1, box5box01=1, box5box00=1, box1box12=1, box8box10=1, box4box10=1, col8=3, col9=2, box8box11=1, col6=4, col7=2, col4=1, col5=2, col2=1, col3=3, box6box02=1, box6box00=1, col1=2, box9box01=1, box3box00=1, row1=2, box9box00=1, row7=2, box2box11=1, row6=4, row9=2, box7box10=1, row8=3, row3=3, row2=1, row5=2, row4=1, box1box01=1, box7box01=1, box8box00=1, box6box12=1, box6box11=1}
{box3box11=1, box3box12=1, box5box01=1, box2box22=1, box5box00=1, box1box12=1, box8box10=1, box4box10=1, col8=4, col9=2, box8box11=1, col6=5, col7=2, col4=1, col5=2, col2=2, col3=3, box6box02=1, box6box00=1, col1=2, box9box01=1, box6box20=1, box3box00=1, row1=2, box9box00=1, row7=2, box2box11=1, row6=5, row9=2, box7box10=1, row8=4, row3=3, row2=2, row5=2, row4=1, box1box01=1, box7box01=1, box8box00=1, box8box22=1, box6box12=1, box6box11=1}
{box3box11=1, box3box12=1, box5box01=1, box2box22=1, box5box00=1, box5box22=1, box1box12=1, box8box10=1, box4box10=1, col8=4, col9=3, box8box11=1, col6=5, col7=2, col4=2, col5=3, col2=2, col3=3, box6box02=1, box6box00=1, col1=3, box9box01=1, box6box20=1, box3box00=1, row1=3, box9box21=1, box9box00=1, row7=2, box2box11=1, row6=5, row9=3, box7box10=1, row8=4, row3=3, row2=2, row5=3, row4=2, box1box01=1, box1box21=1, box7box01=1, box4box21=1, box8box00=1, box8box22=1, box6box12=1, box6box11=1}
{box3box11=1, box3box12=1, box5box01=1, box2box22=1, box5box00=1, box5box22=1, box7box22=1, box1box12=1, box8box10=1, box4box10=1, col8=5, col9=4, box8box11=1, col6=5, col7=3, col4=2, col5=3, col2=2, col3=3, box6box02=1, box6box00=1, col1=3, box9box01=1, box6box20=1, box3box00=1, row1=3, box9box21=1, box9box00=1, box9box22=1, row7=3, box2box11=1, row6=5, row9=4, box7box10=1, row8=5, row3=3, row2=2, row5=3, row4=2, box1box01=1, box1box21=1, box7box01=1, box4box21=1, box8box21=1, box8box00=1, box8box22=1, box6box12=1, box6box11=1}
true

Process finished with exit code 0
*/
