package com.yuya;

import java.util.List;
import java.util.stream.Collectors;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        List<String> humanlist = List.of("yuya", "taka", "yuta", "hiroki", "koudai");
        System.out.println(humanlist.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(".")));
    }
}



