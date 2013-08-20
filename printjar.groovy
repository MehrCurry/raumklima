file = new File(args[0])
name = args.size() > 1 ? args[1] : "META-INF/MANIFEST.MF"
jar = new java.util.jar.JarFile(file)
entry = jar.getEntry(name)
istream = jar.getInputStream(entry)
println(istream.text)
istream.close()