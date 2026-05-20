# Pattern Selection & Justification (SOLID)

## Selected Patterns
- **Observer** – for one-to-many event notification.
- **Chain of Responsibility** – for sequential audio processing.

## Why They Fit
- `BandEventManager` (Subject) notifies all observers when a note is played.
- The same note creates a `SoundRequest` that passes through the effect chain.

## SOLID Principles Applied

### Observer Pattern
- **SRP:** Each observer (Lighting, Recorder) has one reason to change.
- **OCP:** New observers can be added without modifying `BandEventManager`.
- **LSP:** Any observer can replace another.
- **ISP:** Observer interface has only `update(Event)`.
- **DIP:** `BandEventManager` depends on `Observer` abstraction.

### Chain of Responsibility
- **SRP:** Each effect handler does one effect.
- **OCP:** New effects (e.g., Compressor) added without changing others.
- **LSP:** Any handler can be swapped.
- **ISP:** `AudioHandler` has only `handleRequest()` and `setNext()`.
- **DIP:** Client depends on `AudioHandler` abstraction.

## Conclusion
The combination satisfies all requirements and keeps the system extensible.