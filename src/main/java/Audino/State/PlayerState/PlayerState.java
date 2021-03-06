package Audino.State.PlayerState;

import Audino.MediaControl.Player;

/**
 * Root interface for all states.
 * Taken from:
 * https://refactoring.guru/design-patterns/state/java/example
 */
public abstract class PlayerState {
    Player player;

    PlayerState(Player player) {
        this.player = player;
    }

    public abstract void onPlay();
    public abstract void onStop();
    public abstract void onNext();
    public abstract void onPrevious();

    public abstract void onFastForward();
    public abstract void onRewind();
    public abstract void onSeek(double seekTo);

    public abstract void onRepeatChange();

    public abstract void onShuffleChange();
}
