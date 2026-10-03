# Mobile EDA Suite — Development Roadmap

**Version:** 2.0
**Status:** Active
**Language:** Simplified Technical English (ASD-STE100)

---

## 1. Purpose

This document gives the development plan for the Mobile EDA Suite. The plan shows 13 versions. Each version adds features. The plan also shows parallel tracks. Some tracks run at the same time.

---

## 2. Rules

These rules control the project:

1. Ship a working app first. Add features later.
2. Build the native format first. Add KiCad later.
3. Use public AI services. Do not build custom models now.
4. Write shared logic in Kotlin. Use native code for math.
5. Use C code for heavy tasks. This includes SPICE and physics.
6. Cap large files. Do not crash on them.
7. Run tracks in parallel. Freeze the format first.
8. Test on low, mid, and high tier devices.

---

## 3. Version Plan

The app grows in four phases. Each phase has a clear goal.

<svg viewBox="0 0 680 540" xmlns="http://www.w3.org/2000/svg" font-family="ui-sans-serif, system-ui, -apple-system, sans-serif" role="img" aria-label="Version roadmap in four phases">
  <defs>
    <marker id="arr1" viewBox="0 0 10 10" refX="9" refY="5" markerWidth="6" markerHeight="6" orient="auto">
      <path d="M 0 0 L 10 5 L 0 10 z" fill="#656d76"/>
    </marker>
  </defs>

  <rect x="110" y="20" width="460" height="110" rx="10" fill="#f6f8fa" stroke="#0969da" stroke-width="2"/>
  <text x="130" y="42" fill="#0969da" font-size="12" font-weight="700" letter-spacing="2">NATIVE CORE</text>
  <line x1="130" y1="52" x2="550" y2="52" stroke="#d0d7de" stroke-width="1"/>
  <rect x="180" y="62" width="100" height="52" rx="6" fill="#ffffff" stroke="#0969da" stroke-width="1.5"/>
  <text x="230" y="84" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.1</text>
  <text x="230" y="102" text-anchor="middle" fill="#656d76" font-size="10">Hello Circuit</text>
  <rect x="290" y="62" width="100" height="52" rx="6" fill="#ffffff" stroke="#0969da" stroke-width="1.5"/>
  <text x="340" y="84" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.2</text>
  <text x="340" y="102" text-anchor="middle" fill="#656d76" font-size="10">Live Sim</text>
  <rect x="400" y="62" width="100" height="52" rx="6" fill="#ffffff" stroke="#0969da" stroke-width="1.5"/>
  <text x="450" y="84" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.3</text>
  <text x="450" y="102" text-anchor="middle" fill="#656d76" font-size="10">Usable Editor</text>

  <line x1="340" y1="132" x2="340" y2="148" stroke="#656d76" stroke-width="2" marker-end="url(#arr1)"/>

  <rect x="110" y="150" width="460" height="110" rx="10" fill="#f6f8fa" stroke="#9a6700" stroke-width="2"/>
  <text x="130" y="172" fill="#9a6700" font-size="12" font-weight="700" letter-spacing="2">KICAD INTEROP</text>
  <line x1="130" y1="182" x2="550" y2="182" stroke="#d0d7de" stroke-width="1"/>
  <rect x="180" y="192" width="100" height="52" rx="6" fill="#ffffff" stroke="#9a6700" stroke-width="1.5"/>
  <text x="230" y="214" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.4</text>
  <text x="230" y="232" text-anchor="middle" fill="#656d76" font-size="10">Import .sch</text>
  <rect x="290" y="192" width="100" height="52" rx="6" fill="#ffffff" stroke="#9a6700" stroke-width="1.5"/>
  <text x="340" y="214" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.5</text>
  <text x="340" y="232" text-anchor="middle" fill="#656d76" font-size="10">PCB View</text>
  <rect x="400" y="192" width="100" height="52" rx="6" fill="#ffffff" stroke="#9a6700" stroke-width="1.5"/>
  <text x="450" y="214" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.6</text>
  <text x="450" y="232" text-anchor="middle" fill="#656d76" font-size="10">Round-Trip</text>

  <line x1="340" y1="262" x2="340" y2="278" stroke="#656d76" stroke-width="2" marker-end="url(#arr1)"/>

  <rect x="110" y="280" width="460" height="110" rx="10" fill="#f6f8fa" stroke="#0d7d8c" stroke-width="2"/>
  <text x="130" y="302" fill="#0d7d8c" font-size="12" font-weight="700" letter-spacing="2">PHYSICS + AI</text>
  <line x1="130" y1="312" x2="550" y2="312" stroke="#d0d7de" stroke-width="1"/>
  <rect x="180" y="322" width="100" height="52" rx="6" fill="#ffffff" stroke="#0d7d8c" stroke-width="1.5"/>
  <text x="230" y="344" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.7</text>
  <text x="230" y="362" text-anchor="middle" fill="#656d76" font-size="10">Thermal + PI</text>
  <rect x="290" y="322" width="100" height="52" rx="6" fill="#ffffff" stroke="#0d7d8c" stroke-width="1.5"/>
  <text x="340" y="344" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.8</text>
  <text x="340" y="362" text-anchor="middle" fill="#656d76" font-size="10">Parasitic</text>
  <rect x="400" y="322" width="100" height="52" rx="6" fill="#ffffff" stroke="#8250df" stroke-width="1.5"/>
  <text x="450" y="344" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v0.9</text>
  <text x="450" y="362" text-anchor="middle" fill="#656d76" font-size="10">AI Tuning</text>

  <line x1="340" y1="392" x2="340" y2="408" stroke="#656d76" stroke-width="2" marker-end="url(#arr1)"/>

  <rect x="110" y="410" width="460" height="110" rx="10" fill="#f6f8fa" stroke="#cf222e" stroke-width="2"/>
  <text x="130" y="432" fill="#cf222e" font-size="12" font-weight="700" letter-spacing="2">EMBEDDED SIM</text>
  <line x1="130" y1="442" x2="550" y2="442" stroke="#d0d7de" stroke-width="1"/>
  <rect x="180" y="452" width="100" height="52" rx="6" fill="#ffffff" stroke="#cf222e" stroke-width="1.5"/>
  <text x="230" y="474" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v1.0</text>
  <text x="230" y="492" text-anchor="middle" fill="#656d76" font-size="10">AVR8</text>
  <rect x="290" y="452" width="100" height="52" rx="6" fill="#ffffff" stroke="#cf222e" stroke-width="1.5"/>
  <text x="340" y="474" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v1.1</text>
  <text x="340" y="492" text-anchor="middle" fill="#656d76" font-size="10">Cortex-M0+</text>
  <rect x="400" y="452" width="100" height="52" rx="6" fill="#ffffff" stroke="#cf222e" stroke-width="1.5"/>
  <text x="450" y="474" text-anchor="middle" fill="#1f2328" font-size="14" font-weight="700">v1.2</text>
  <text x="450" y="492" text-anchor="middle" fill="#656d76" font-size="10">ESP32 + PIO</text>
</svg>

### 3.1 Phase Summary

| Phase | Versions | Theme | Main Result |
|-------|----------|-------|-------------|
| 1 | v0.1 – v0.3 | Native core | Editor and simulator work |
| 2 | v0.4 – v0.6 | KiCad interop | Read and write KiCad files |
| 3 | v0.7 – v0.9 | Physics and AI | Thermal, parasitic, AI tuning |
| 4 | v1.0 – v1.2 | Embedded sim | Run firmware on the device |

---

## 4. Parallel Tracks

Six tracks run in parallel after the format is frozen. The format is frozen at v0.3.

<svg viewBox="0 0 1000 320" xmlns="http://www.w3.org/2000/svg" font-family="ui-sans-serif, system-ui, -apple-system, sans-serif" role="img" aria-label="Track dependency graph">
  <defs>
    <marker id="arr2" viewBox="0 0 10 10" refX="9" refY="5" markerWidth="6" markerHeight="6" orient="auto">
      <path d="M 0 0 L 10 5 L 0 10 z" fill="#656d76"/>
    </marker>
    <marker id="arr2d" viewBox="0 0 10 10" refX="9" refY="5" markerWidth="6" markerHeight="6" orient="auto">
      <path d="M 0 0 L 10 5 L 0 10 z" fill="#8250df"/>
    </marker>
  </defs>

  <rect x="30" y="140" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#0969da" stroke-width="2"/>
  <text x="100" y="166" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">A. Editor</text>
  <text x="100" y="184" text-anchor="middle" fill="#656d76" font-size="11">Native Format</text>

  <rect x="230" y="40" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#1a7f37" stroke-width="2"/>
  <text x="300" y="66" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">B. SPICE</text>
  <text x="300" y="84" text-anchor="middle" fill="#656d76" font-size="11">Simulation</text>

  <rect x="230" y="140" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#8250df" stroke-width="2"/>
  <text x="300" y="166" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">C. AI</text>
  <text x="300" y="184" text-anchor="middle" fill="#656d76" font-size="11">Public APIs</text>

  <rect x="430" y="140" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#9a6700" stroke-width="2"/>
  <text x="500" y="166" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">D. KiCad</text>
  <text x="500" y="184" text-anchor="middle" fill="#656d76" font-size="11">Interop</text>

  <rect x="630" y="140" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#0d7d8c" stroke-width="2"/>
  <text x="700" y="166" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">E. Physics</text>
  <text x="700" y="184" text-anchor="middle" fill="#656d76" font-size="11">Thermal + EMI</text>

  <rect x="830" y="140" width="140" height="60" rx="8" fill="#f6f8fa" stroke="#cf222e" stroke-width="2"/>
  <text x="900" y="166" text-anchor="middle" fill="#1f2328" font-size="13" font-weight="700">F. Embedded</text>
  <text x="900" y="184" text-anchor="middle" fill="#656d76" font-size="11">AVR / ARM</text>

  <path d="M 170 160 Q 200 100 230 70" stroke="#656d76" stroke-width="2" fill="none" marker-end="url(#arr2)"/>
  <path d="M 170 170 L 230 170" stroke="#656d76" stroke-width="2" fill="none" marker-end="url(#arr2)"/>
  <path d="M 170 180 L 430 170" stroke="#656d76" stroke-width="2" fill="none" marker-end="url(#arr2)"/>
  <path d="M 570 170 L 630 170" stroke="#656d76" stroke-width="2" fill="none" marker-end="url(#arr2)"/>
  <path d="M 770 170 L 830 170" stroke="#656d76" stroke-width="2" fill="none" marker-end="url(#arr2)"/>
  <path d="M 300 200 Q 500 260 700 200" stroke="#8250df" stroke-width="2" fill="none" stroke-dasharray="5 3" marker-end="url(#arr2d)"/>

  <text x="100" y="230" text-anchor="middle" fill="#656d76" font-size="10">GATE</text>
  <text x="500" y="280" text-anchor="middle" fill="#8250df" font-size="10">AI helps tuning</text>
</svg>

**Legend:**
- **Solid arrow** = hard dependency.
- **Dashed arrow** = soft help.
- **GATE** = format must be frozen first.

---

## 5. Track A — Editor and Native Format

**Goal:** A user can make, save, load, and simulate a simple circuit.

| ID | Task | Time |
|----|------|------|
| A1 | Set up the KMP project for Android and iOS. | 1 wk |
| A2 | Define the native circuit format. Use JSON. | 1 wk |
| A3 | Build the schematic editor. Add R, L, C, V, I, GND, diode, transistor. | 2 wk |
| A4 | Add the wire tool. Infer nets automatically. | 2 wk |
| A5 | Add save and load for the native format. | 1 wk |
| A10 | Add undo and redo. | 1 wk |
| A11 | Add a component library. Add search. | 2 wk |
| A12 | Add multi-sheet support. | 2 wk |
| A13 | Add batch component grouping. Add color tags. | 1.5 wk |
| A14 | Add the dual-canvas Microscope view. Add a mini-map. | 2 wk |

**Note:** A2 is the gate. All other tracks wait for A2.

---

## 6. Track B — SPICE Engine

**Goal:** Run DC, AC, and transient simulations.

| ID | Task | Time |
|----|------|------|
| B1 | Cross-compile `libngspice` for arm64, x86_64, and Apple Silicon. | 2 wk |
| B2 | Write the netlist generator in Kotlin. | 1.5 wk |
| B3 | Build the JNI and cinterop bridge. Use coroutines for worker threads. | 2 wk |
| B4 | Add the waveform viewer. Add pan, zoom, and cursors. | 2 wk |
| B5 | Add interactive probes for voltage and current. | 1.5 wk |
| B6 | Add live re-simulation when the user changes a value. | 1.5 wk |

**Milestone:** Build an RC filter. Run a transient simulation. See the waveform.

---

## 7. Track C — AI Layer

**Goal:** Use public AI services for smart features. Do not train custom models.

| ID | Task | Time |
|----|------|------|
| C1 | Build the AI gateway. Support OpenAI, Anthropic, and Gemini. | 2 wk |
| C2 | Write prompt templates for common tasks. | 1 wk |
| C3 | Generate netlists from natural language. | 2 wk |
| C4 | Analyze simulation logs. Give diagnostics. | 1.5 wk |
| C5 | Add a settings screen for API keys. Handle rate limits. | 1 wk |
| C6 | Build the closed-loop tuning engine. | 3 wk |
| C7 | Add design-space sweeps via AI. | 2 wk |
| C8 | Add AI layout hints for component placement. | 2 wk |
| C9 | Add "explain this waveform" and "why is this ringing?" | 2 wk |
| C10 | Add cost and latency tracking. Add model fallback. | 1.5 wk |

**Milestone:** A user describes a circuit in plain words. The AI builds it, simulates it, and tunes it.

---

## 8. Track D — KiCad Interop

**Goal:** Read and write KiCad files. Start with read-only.

| ID | Task | Time |
|----|------|------|
| D1 | Write the S-Expression parser for `.kicad_sch`. | 2 wk |
| D2 | Map KiCad data to the native model. | 2 wk |
| D3 | Render imported schematics. | 1 wk |
| D4 | Run SPICE on imported netlists. | 1 wk |
| D5 | Add the file-size policy. See Section 12. | 1 wk |
| D6 | Add a streaming parser and mmap for large files. | 2 wk |
| D7 | Write the `.kicad_pcb` parser. | 2 wk |
| D8 | Render PCB layers: F.Cu, B.Cu, silk, mask. | 2 wk |
| D9 | Render copper pours and traces at 60 FPS. | 2 wk |
| D10 | Add a mini-map for large boards. | 1 wk |
| D11 | Write the `.kicad_sch` exporter. | 2 wk |
| D12 | Allow edits to imported circuits. Save them back. | 2 wk |
| D13 | Map the symbol library. | 1.5 wk |

**Milestone v0.4:** Open a real KiCad schematic. View it. Simulate it.

**Milestone v0.6:** Edit a KiCad schematic. Export it. Open it on desktop KiCad.

---

## 9. Track E — Physics Solvers

**Goal:** Add thermal, parasitic, and EMI analysis.

| ID | Task | Time |
|----|------|------|
| E1 | Write the 2D FDM thermal solver in C. | 3 wk |
| E2 | Write the IR-drop and power-integrity analyzer. | 2 wk |
| E3 | Write GPU shaders for heatmaps and IR-drop. | 2 wk |
| E4 | Write the RLC parasitic extractor. Use PEEC and TL theory. | 4 wk |
| E5 | Inject parasitics into the netlist automatically. | 2 wk |
| E6 | Add the EMI cross-coupling overlay. | 2 wk |

**Milestone:** Show a live thermal heatmap on top of a real PCB layout.

---

## 10. Track F — Embedded System Simulation

**Goal:** Run real firmware on the phone. This is the Proteus-class feature.

### 10.1 Version Plan

| Version | Chip | ISA | Effort |
|---------|------|-----|--------|
| v1.0 | ATmega328P | AVR8 | 13 wk |
| v1.1 | RP2040, STM32F0 | Cortex-M0+ | 10 wk |
| v1.2 | ESP32, RP2040 PIO | Xtensa, PIO | 12 wk |

### 10.2 Tasks

| ID | Task | Time |
|----|------|------|
| F1 | Write the AVR8 instruction set simulator in C. | 4 wk |
| F2 | Add AVR8 peripherals: GPIO, timers, UART, SPI, I2C, ADC, PWM. | 4 wk |
| F3 | Add the firmware loader for `.hex`, `.elf`, `.bin`. | 1 wk |
| F4 | Build the mixed-signal co-simulation bridge. | 4 wk |
| F5 | Build the embedded debug UI. Add registers, memory, breakpoints. | 3 wk |
| F6 | Write the Cortex-M0+ ISS. | 5 wk |
| F7 | Add CM0+ peripherals: NVIC, SysTick, GPIO, USART, SPI, I2C, ADC. | 5 wk |
| F8 | Write the Xtensa LX6 ISS for ESP32. Use a subset. | 6 wk |
| F9 | Add ESP32 WiFi and BLE stubs. Use sockets, not RF. | 3 wk |
| F10 | Write the RP2040 PIO state-machine model. | 3 wk |

**Milestone v1.0:** Blink an LED in a schematic. Use a real `.hex` file. Run on the phone.

---

## 11. AI Plan

Use public AI services first. Build custom models only if needed.

<svg viewBox="0 0 900 300" xmlns="http://www.w3.org/2000/svg" font-family="ui-sans-serif, system-ui, -apple-system, sans-serif" role="img" aria-label="AI strategy decision flow">
  <defs>
    <marker id="arr3" viewBox="0 0 10 10" refX="9" refY="5" markerWidth="6" markerHeight="6" orient="auto">
      <path d="M 0 0 L 10 5 L 0 10 z" fill="#656d76"/>
    </marker>
  </defs>

  <rect x="40" y="60" width="360" height="200" rx="10" fill="#f6f8fa" stroke="#8250df" stroke-width="2"/>
  <text x="220" y="90" text-anchor="middle" fill="#8250df" font-size="14" font-weight="700">NOW: PUBLIC AI</text>
  <line x1="60" y1="105" x2="380" y2="105" stroke="#d0d7de" stroke-width="1"/>
  <text x="60" y="130" fill="#1f2328" font-size="12">Use for:</text>
  <text x="80" y="152" fill="#656d76" font-size="12">• Netlist generation</text>
  <text x="80" y="172" fill="#656d76" font-size="12">• Log analysis</text>
  <text x="80" y="192" fill="#656d76" font-size="12">• Closed-loop tuning</text>
  <text x="80" y="212" fill="#656d76" font-size="12">• Waveform explanation</text>
  <text x="80" y="232" fill="#656d76" font-size="12">• Circuit explanation</text>

  <line x1="410" y1="160" x2="490" y2="160" stroke="#656d76" stroke-width="2" marker-end="url(#arr3)"/>
  <text x="450" y="150" text-anchor="middle" fill="#656d76" font-size="11">if all true</text>

  <rect x="500" y="60" width="360" height="200" rx="10" fill="#f6f8fa" stroke="#0969da" stroke-width="2" stroke-dasharray="6 3"/>
  <text x="680" y="90" text-anchor="middle" fill="#0969da" font-size="14" font-weight="700">LATER: LOCAL µ-MODELS</text>
  <line x1="520" y1="105" x2="840" y2="105" stroke="#d0d7de" stroke-width="1"/>
  <text x="520" y="130" fill="#1f2328" font-size="12">Only if:</text>
  <text x="540" y="152" fill="#656d76" font-size="12">• Latency is more than 300 ms</text>
  <text x="540" y="172" fill="#656d76" font-size="12">• Cost is too high</text>
  <text x="540" y="192" fill="#656d76" font-size="12">• Offline mode is required</text>
  <text x="540" y="212" fill="#656d76" font-size="12">• The task is narrow</text>
  <text x="540" y="240" fill="#656d76" font-size="11" font-style="italic">Not before v1.3</text>
</svg>

### 11.1 Why Public AI First

Public AI services give these benefits:

1. No training cost.
2. No model operations.
3. Fast iteration.
4. Strong results on day one.

Custom EDA models need labeled data. We do not have this data now. Collect it first.

### 11.2 When to Build Local Models

Build local models only if **all** of these are true:

- Public API latency is more than 300 ms.
- Public API cost is more than the budget.
- Offline mode is a user requirement.
- The task is narrow and repeatable.

**Good tasks for local models:** transistor sizing, SPICE convergence guess, thermal map approximation.

**Bad tasks for local models:** natural language, log analysis, code generation.

---

## 12. KiCad File-Size Policy

KiCad files can be very large. Use this policy.

| Tier | Size | Action |
|------|------|--------|
| Green | Less than 25 MB | Load fully in memory. |
| Yellow | 25 MB to 100 MB | Use streaming. Warn the user. |
| Orange | 100 MB to 500 MB | Use mmap. Load layers on demand. Disable live sim. |
| Red | More than 500 MB | Do not load. Offer a subset tool. |

### 12.1 Techniques

1. Use a streaming parser. Do not build a full DOM.
2. Use `mmap` on Android and iOS. Copy no data.
3. Build an R-tree index on disk.
4. Load only the visible PCB layers.

---

## 13. Embedded Sim Feasibility

Not all chips can run on a phone. This table shows what is possible.

| Chip | ISA | Feasibility | Notes |
|------|-----|-------------|-------|
| ATmega328P | AVR8 | Excellent | 10 to 50 times real-time on modern ARM. |
| RP2040 | dual Cortex-M0+ | Excellent | PIO needs a custom model. |
| STM32F0/F1/L0 | Cortex-M0+/M3 | Good | Start with F0 and L0. |
| ESP32 / S3 | Xtensa LX6 / RISC-V | Moderate | Stub WiFi and BLE. Do not simulate RF. |
| Raspberry Pi | ARM64 + Linux | Out of scope | Full Linux is too heavy for mobile. |

### 13.1 Start with AVR8

The AVR8 has a simple ISA. It has a large community. It is the best first target.

---

## 14. Timeline

The plan takes about 18 months with a team of 4 to 6 people.

<svg viewBox="0 0 1000 260" xmlns="http://www.w3.org/2000/svg" font-family="ui-sans-serif, system-ui, -apple-system, sans-serif" role="img" aria-label="Timeline by track">
  <text x="20" y="30" fill="#1f2328" font-size="12" font-weight="700">Track</text>
  <text x="120" y="30" fill="#656d76" font-size="10">Q1</text>
  <text x="240" y="30" fill="#656d76" font-size="10">Q2</text>
  <text x="360" y="30" fill="#656d76" font-size="10">Q3</text>
  <text x="480" y="30" fill="#656d76" font-size="10">Q4</text>
  <text x="600" y="30" fill="#656d76" font-size="10">Q5</text>
  <text x="720" y="30" fill="#656d76" font-size="10">Q6</text>

  <text x="20" y="70" fill="#1f2328" font-size="12">A. Editor</text>
  <rect x="120" y="55" width="240" height="18" rx="4" fill="#0969da"/>
  <text x="130" y="68" fill="#ffffff" font-size="10">v0.1 – v0.3</text>

  <text x="20" y="100" fill="#1f2328" font-size="12">B. SPICE</text>
  <rect x="180" y="85" width="300" height="18" rx="4" fill="#1a7f37"/>

  <text x="20" y="130" fill="#1f2328" font-size="12">C. AI</text>
  <rect x="240" y="115" width="540" height="18" rx="4" fill="#8250df"/>

  <text x="20" y="160" fill="#1f2328" font-size="12">D. KiCad</text>
  <rect x="300" y="145" width="240" height="18" rx="4" fill="#9a6700"/>

  <text x="20" y="190" fill="#1f2328" font-size="12">E. Physics</text>
  <rect x="480" y="175" width="180" height="18" rx="4" fill="#0d7d8c"/>

  <text x="20" y="220" fill="#1f2328" font-size="12">F. Embedded</text>
  <rect x="600" y="205" width="360" height="18" rx="4" fill="#cf222e"/>

  <line x1="120" y1="40" x2="120" y2="240" stroke="#d0d7de" stroke-width="1"/>
  <line x1="240" y1="40" x2="240" y2="240" stroke="#d0d7de" stroke-width="1"/>
  <line x1="360" y1="40" x2="360" y2="240" stroke="#d0d7de" stroke-width="1"/>
  <line x1="480" y1="40" x2="480" y2="240" stroke="#d0d7de" stroke-width="1"/>
  <line x1="600" y1="40" x2="600" y2="240" stroke="#d0d7de" stroke-width="1"/>
  <line x1="720" y1="40" x2="720" y2="240" stroke="#d0d7de" stroke-width="1"/>
</svg>

---

## 15. Next Steps

Do these steps in order:

1. Freeze the native circuit format. This is A2.
2. Build a small editor. Add R, V, and GND. Add the wire tool.
3. Cross-compile `libngspice` for arm64. Test the JNI call.
4. Ship v0.1 inside the team. Use a voltage divider and a DC op.
5. Build the AI gateway. Do this before v0.3.
6. Pick the build toolchain. Use Clang and CMake, or the Android NDK.
7. Wait for KiCad. Start it at v0.4.

---

## 16. Word List

This document uses simple words. This list shows the meaning of some terms.

| Term | Meaning |
|------|---------|
| Gate | A task that blocks other tasks. |
| Track | A group of related tasks. |
| FDM | Finite Difference Method. |
| ISS | Instruction Set Simulator. |
| KMP | Kotlin Multiplatform. |
| JNI | Java Native Interface. |
| NPU | Neural Processing Unit. |
| SPICE | Simulation Program with Integrated Circuit Emphasis. |
| PEEC | Partial Element Equivalent Circuit. |
| TL | Transmission Line. |

---

*End of roadmap.*