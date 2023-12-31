package org.example.homeWork.company;

import java.util.Date;

public class PriorityTask extends Task {
    private final int requiredPriority;

    public PriorityTask(String title, Date deadline, int priority, double reward, int requiredPriority) {
        super(title, deadline, priority, reward);
        this.requiredPriority = requiredPriority;
    }

    @Override
    public double calculatePayment() {
        if (getPriority() == requiredPriority) {
            return super.calculatePayment();
        } else {
            return 0.0;
        }
    }

    @Override
    public double calculateTotalPayment() {
        return 0;
    }
}