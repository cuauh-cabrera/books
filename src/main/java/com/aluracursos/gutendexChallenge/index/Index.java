package com.aluracursos.gutendexChallenge.index;

import com.aluracursos.gutendexChallenge.model.Data;
import com.aluracursos.gutendexChallenge.service.ConnectAPI;
import com.aluracursos.gutendexChallenge.service.ConvertData;

public class Index {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private final ConvertData convert = new ConvertData();
    public void showAllBooks(){
        var json = ConnectAPI.fetchData(URL_BASE);
        System.out.println(json);
        var data = ConvertData.<Data>getData(json, Data.class);
    }
}
