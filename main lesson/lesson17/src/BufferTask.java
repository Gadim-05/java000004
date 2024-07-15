class BufferTask implements Runnable {
    private StringBuffer buffer;

    public BufferTask(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.append(" - Thread ");
            buffer.append(Thread.currentThread().getId());
            buffer.append(" | ");

            // Simulate some work with a short sleep
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}