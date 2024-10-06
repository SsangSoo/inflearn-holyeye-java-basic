package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        // 볼륨 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeDown();
        // 상태 확인
        musicPlayer.showStatus();
        // 플레이어 끄기
        musicPlayer.off();
    }
}
