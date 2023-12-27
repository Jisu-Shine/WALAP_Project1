package model;

import java.util.Date;

public class BookModel {
    private String title;
    private String author;
    private Date startDate;
    private Date lastReadDate;
    private int pagesRead;
    private int totalPages; // 추가: 전체 페이지 수
    private double progress;

    // 생성자
    public BookModel(String title, String author, Date startDate, Date lastReadDate, int pagesRead, int totalPages) {
        this.title = title;
        this.author = author;
        this.startDate = startDate;
        this.lastReadDate = lastReadDate;
        this.pagesRead = pagesRead;
        this.totalPages = totalPages;
        this.progress = totalPages/pagesRead;
    }
    // Getter 및 Setter 메서드들
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getLastReadDate() {
        return lastReadDate;
    }

    public void setLastReadDate(Date lastReadDate) {
        this.lastReadDate = lastReadDate;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Book{" +
                "제목: " + title + '\'' +
                "저자: ='" + author + '\'' +
                "독서 시작 날짜: " + startDate +
                "마지막 독서 날짜: " + lastReadDate +
                "읽은 페이지 수: " + pagesRead +
                "전체 페이지 수: " + totalPages +
                "진행률: " + progress +
                '}';
    }
}
