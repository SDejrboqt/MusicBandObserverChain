# Problem Analysis & Trade-offs

## Real-World Problem
A music band uses a digital performance system. When a musician plays a note:
1. Multiple subsystems must react (lighting, recording, display, audience app).
2. The audio signal must pass through a chain of effects (reverb → delay → volume) in order.

## Design Challenges
- Notify many independent components without coupling.
- Apply effects in fixed order, each can pass or stop.
- Add new observers or effects without modifying existing code.

## Pattern Comparison

| Pattern | Strengths | Weaknesses |
|---------|-----------|-------------|
| Observer | 1-to-many notification, loose coupling | No sequential processing, cannot stop/forward |
| Chain of Responsibility | Sequential handling, each decides pass/stop | 1-to-1, cannot broadcast to many |

## Trade-offs & Decision
- Using only Observer → no effect chain.
- Using only Chain of Responsibility → lighting/recording never notified.
- **Decision:** Combine both patterns – each solves a separate requirement.