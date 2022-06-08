package com.tns.dao;

import java.util.List;

import com.tns.entities.Book;

public interface BookDao
{
	public abstract Book getBookByID(int id);
	public abstract List<Book>getBookTitle(String title);
	public abstract List<Book>getAuthorBooks(String author);
	public abstract List<Book>getBookInPriceRange(double low,double high);
	public abstract List<Book>getALLBooks();
	public abstract Long getBookCount();

}
