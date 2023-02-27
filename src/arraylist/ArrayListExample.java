package arraylist;

import arraylist.Board;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        //저장된 총 객체수 얻기
        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

        //특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println("board.getSubject() + board.getContent() + board.getWriter() = " + board.getSubject() + board.getContent() + board.getWriter());

        //모든 객체 하나씩 가져오기
        for (Board board1 : list) {
            System.out.println("board1 = " + board1.getSubject() + board1.getContent() + board1.getWriter());
        }

        //객체 삭제
        list.remove(1);
        list.remove(1);
    }
}
