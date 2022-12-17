package com.audio.play;

/**
 * @author 孙骁
 * @date 2022-12-14
 */
public class Animation extends Thread {

    /**
     * 音符
     */
    private String[] notes;
    /**
     * 间隔时间（单位：毫秒）
     */
    private int times;

    public Animation(int times) {
        this.times = times;
    }

    public Animation(String[] notes, int times) {
        this.notes = notes;
        this.times = times;
    }

    public String[] getNotes() {
        return this.notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public int getTimes() {
        return this.times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Animation loadNotes(String notes) {
        this.notes = notes.split(" ");
        return this;
    }

    @Override
    public void run() {
        try {
            int times = this.times;
            new Audio("song/test.mp3").start();
            sleep(1000);
            for (String note : this.notes) {
                if (note.length() < 1) {
                    continue;
                }
                String n = note.replace("+", "").replace("-", "");
                if ("\n".equals(n) || "\r".equals(n)) {
                    System.out.print("\n");
                    continue;
                }
                switch (n) {
                    case "0":
                        System.out.print("_");
                        break;
                    case "1":
                        System.out.print("▁");
                        break;
                    case "2":
                        System.out.print("▂");
                        break;
                    case "3":
                        System.out.print("▃");
                        break;
                    case "4":
                        System.out.print("▄");
                        break;
                    case "5":
                        System.out.print("▅");
                        break;
                    case "6":
                        System.out.print("▆");
                        break;
                    case "7":
                        System.out.print("▇");
                        break;
                    default:
                }
                System.out.print(" ");
                sleep(times);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
