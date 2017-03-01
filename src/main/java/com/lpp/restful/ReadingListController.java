package com.lpp.restful;

import com.lpp.domain.Book;
import com.lpp.domain.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by tangcheng on 2017/2/25.
 */
@Controller
@RequestMapping(value = "/todo")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;

    @RequestMapping(value = "{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable(value = "reader") String reader, Model model) {
        List<Book> bookList = readingListRepository.findByReader(reader);
        model.addAttribute("books", bookList);
        return "readingList";
    }

    @RequestMapping(value = "{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable(value = "reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }

}
