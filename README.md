# DSA Practice Repository

A collection of Java implementations and practice problems for data structures, algorithms, and common interview patterns. Source files are grouped by topic under `src/`.

## Topics

- Arrays and prefix sums
- Binary search
- Hashing
- Linked lists
- Matrices
- Sorting
- String algorithms
- Two-pointer techniques
- Additional practice problems in `mustsolve/`

## Source Layout

```text
src/
├── array/
├── BinarySearch/
├── Hasing/
│   └── matrix/
├── linkedlist/
│   ├── implementation/
│   └── problems/
├── Matrix/
├── mustsolve/
├── sorting/
├── String/
├── TwoPointers/
└── Main.java
```

Package names follow the source folder structure. Existing capitalization and the `Hasing` spelling are retained in the folder/package names.

## Requirements

- JDK 24 (or a compatible JDK configured in your IDE)
- PowerShell for the commands below

## Build and Run

Run these commands from the repository root. Compiling all sources together keeps package names and cross-file types resolvable:

```powershell
$out = Join-Path $env:TEMP 'DSA-build'
New-Item -ItemType Directory -Force -Path $out | Out-Null
javac -d $out (Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

Run the default entry point:

```powershell
java -cp $out Main
```

To run an individual class, use its fully qualified package name. For example:

```powershell
java -cp $out array.MaximumProduct
```

The `.project` and `.classpath` files identify `src` as the Java source root for Eclipse-based Java tooling.

## Notes

- Most classes are independent exercises with their own `main` method or callable solution method; there is no single application workflow.
- The repository does not currently include a license file.
