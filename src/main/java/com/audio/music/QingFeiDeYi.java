package com.audio.music;


import com.audio.constant.RhythmConstant;
import com.audio.play.Animation;
import com.audio.play.AudioPlay;

/**
 * @author 孙骁
 * @date 2022-12-14
 */
public class QingFeiDeYi {
    public static void main(String[] args) {
        String notes = RhythmConstant.QFDY_PRESIDE;
        String accompaniments = RhythmConstant.QFDY_BREAK;

//         主音部分
        new AudioPlay(220).loadNotes(notes).start();
//         副音部分
        new AudioPlay(220).loadNotes(accompaniments).start();
        new Animation(220).loadNotes(notes).start();
    }
}
