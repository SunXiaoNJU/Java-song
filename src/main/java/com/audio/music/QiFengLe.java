package com.audio.music;

import com.audio.constant.RhythmConstant;
import com.audio.play.Animation;
import com.audio.play.AudioPlay;


/**
 * @author 孙骁
 * @date 2022-12-14
 */
public class QiFengLe {
    public static void main(String[] args) {
        String notes = RhythmConstant.QFL_PRESIDE;
        String accompaniments = RhythmConstant.QFDY_BREAK;

        new AudioPlay(180).loadNotes(notes).start();
        new Animation(180).loadNotes(notes).start();
//        TODO 伴奏与主旋律难以吻合，需要调整
//        new audioPlay(360).loadNotes(accompaniments).start();
    }
}
