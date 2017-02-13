package com.zyz.notes.template;

/**
 * Created by ZhangYuanzhuo on 2017/1/21.
 */
public class TestPaper {
    public void testQ1() {
        System.out.println("红茶属于( )茶\n" +
                "A.半发酵 B.发酵 C.发酵 D.微发酵");
        System.out.println("答案: " + answer1());
    }

    protected String answer1() {
        return "";
    }

    public void testQ2() {
        System.out.println("满汉全席起兴于( )\n" +
                "A.清代 B.唐代 C.宋代 D.两汉");
        System.out.println("答案: " + answer2());
    }
    public String answer2() {
        return "";
    }

    public void testQ3() {
        System.out.println("吃冰淇淋解渴主要是因为它( )\n" +
                "A.含蛋白质 B.含脂肪 C.含糖");
        System.out.println("答案: " + answer3());
    }

    public String answer3() {
        return "";
    }
}
