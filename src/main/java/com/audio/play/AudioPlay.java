package com.audio.play;

import cn.hutool.core.io.FileUtil;

/**
 * @author 孙骁
 * @date 2022-12-14
 */
public class AudioPlay extends Thread
{
    /** 音符 */
    private String[] notes;
    /** 间隔时间（单位：毫秒） */
    private int times;
    /** 模式 */
    private Mode mode;

    public AudioPlay(String[] notes, int times)
    {
        this.notes = notes;
        this.times = times;
    }


    public AudioPlay(String[] notes, int times, Mode mode)
    {
        this.notes = notes;
        this.times = times;
        this.mode = mode;
    }

    public AudioPlay(String filePath, int times)
    {
        String content = FileUtil.readString(filePath,"UTF-8");
        this.notes = content.split(" ");
        this.times = times;
    }

    public AudioPlay(int times)
    {
        this.times = times;
    }

    public Mode getMode()
    {
        return this.mode;
    }


    public void setMode(Mode mode)
    {
        this.mode = mode;
    }


    public String[] getNotes()
    {
        return this.notes;
    }


    public void setNotes(String[] notes)
    {
        this.notes = notes;
    }
    public AudioPlay loadNotes(String notes)
    {
        this.notes = notes.split(" ");
        return this;
    }


    public int getTimes()
    {
        return this.times;
    }


    public void setTimes(int times)
    {
        this.times = times;
    }


    @Override
    public void run()
    {
        try
        {
            int times = this.times;
            new Audio("song/test.mp3").start();
            sleep(1000);
            for (String note : notes) {
                if (note.length() < 1) {
                    continue;
                }
                switch (note) {
                    case "1--":
                        new Audio("song/ll1.mp3").start();
                        sleep(times / 2);
                        break;
                    case "2--":
                        new Audio("song/ll2.mp3").start();
                        sleep(times / 2);
                        break;
                    case "3--":
                        new Audio("song/ll3.mp3").start();
                        sleep(times / 2);
                        break;
                    case "4--":
                        new Audio("song/ll4.mp3").start();
                        sleep(times / 2);
                        break;
                    case "5--":
                        new Audio("song/ll5.mp3").start();
                        sleep(times / 2);
                        break;
                    case "6--":
                        new Audio("song/ll6.mp3").start();
                        sleep(times / 2);
                        break;
                    case "7--":
                        new Audio("song/ll7.mp3").start();
                        sleep(times / 2);
                        break;
                    case "1-":
                        new Audio("song/l1.mp3").start();
                        sleep(times / 2);
                        break;
                    case "2-":
                        new Audio("song/l2.mp3").start();
                        sleep(times / 2);
                        break;
                    case "3-":
                        new Audio("song/l3.mp3").start();
                        sleep(times / 2);
                        break;
                    case "4-":
                        new Audio("song/l4.mp3").start();
                        sleep(times / 2);
                        break;
                    case "5-":
                        new Audio("song/l5.mp3").start();
                        sleep(times / 2);
                        break;
                    case "6-":
                        new Audio("song/l6.mp3").start();
                        sleep(times / 2);
                        break;
                    case "7-":
                        new Audio("song/l7.mp3").start();
                        sleep(times / 2);
                        break;
                    case "1":
                        new Audio("song/m1.mp3").start();
                        sleep(times / 2);
                        break;
                    case "2":
                        new Audio("song/m2.mp3").start();
                        sleep(times / 2);
                        break;
                    case "3":
                        new Audio("song/m3.mp3").start();
                        sleep(times / 2);
                        break;
                    case "4":
                        new Audio("song/m4.mp3").start();
                        sleep(times / 2);
                        break;
                    case "5":
                        new Audio("song/m5.mp3").start();
                        sleep(times / 2);
                        break;
                    case "6":
                        new Audio("song/m6.mp3").start();
                        sleep(times / 2);
                        break;
                    case "7":
                        new Audio("song/m7.mp3").start();
                        sleep(times / 2);
                        break;
                    case "1+":
                        new Audio("song/h1.mp3").start();
                        sleep(times / 2);
                        break;
                    case "2+":
                        new Audio("song/h2.mp3").start();
                        sleep(times / 2);
                        break;
                    case "3+":
                        new Audio("song/h3.mp3").start();
                        sleep(times / 2);
                        break;
                    case "4+":
                        new Audio("song/h4.mp3").start();
                        sleep(times / 2);
                        break;
                    case "5+":
                        new Audio("song/h5.mp3").start();
                        sleep(times / 2);
                        break;
                    case "6+":
                        new Audio("song/h6.mp3").start();
                        sleep(times / 2);
                        break;
                    case "7+":
                        new Audio("song/h7.mp3").start();
                        sleep(times / 2);
                        break;
                    case "1++":
                        new Audio("song/hh1.mp3").start();
                        sleep(times / 2);
                        break;
                    case "2++":
                        new Audio("song/hh2.mp3").start();
                        sleep(times / 2);
                        break;
                    case "3++":
                        new Audio("song/hh3.mp3").start();
                        sleep(times / 2);
                        break;
                    case "4++":
                        new Audio("song/hh4.mp3").start();
                        sleep(times / 2);
                        break;
                    case "5++":
                        new Audio("song/hh5.mp3").start();
                        sleep(times / 2);
                        break;
                    case "6++":
                        new Audio("song/hh6.mp3").start();
                        sleep(times / 2);
                        break;
                    case "7++":
                        new Audio("song/hh7.mp3").start();
                        sleep(times / 2);
                        break;
                    case "0":
                        sleep(times / 2);
                        break;
                    default:
                        continue;
                }
                sleep(times / 2);
                times = this.times;
            }

        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }

    enum Mode {
        /** 主奏 */
        MAIN,
        /** 伴奏 */
        ACCOMPANIMENTS

    }
}
