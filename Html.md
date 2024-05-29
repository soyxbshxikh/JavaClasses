<h1 align="center">HTML Notes </h1>

### 1. What is  HTML ?

- HTML is a **Hyper Text Markup Language**.
- HTML is used to create web pages.  
- HTML was created by Sir Tim Berners-Lee. ( in 1991 ).
- HTML file name always save .html extension.

---

### 2. Which software is used for HTML ?

- Notepad. 
- Visual Studio Code.
- Sublime Text.

---

### 3. How to see output in Html ?

- Right-Click on Your HTML file, and **open with Browser**.

---

### 4. Basic structure of HTML.

```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Document Name</title>
  </head>

  <body>
    <!-- Code Write here -->
  </body>
</html>
```

---
## 5. Heading Tags.

```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Headings</title>
  </head>
  <body>
    <h1> Heading 1 </h1>
    <h2> Heading 2 </h2>
    <h3> Heading 3 </h3>
    <h4> Heading 4 </h4>
    <h5> Heading 5 </h5>
    <h6> Heading 6 </h6>
  </body>
</html>
```
Output :-
---
<dl>
  <dd> 
    <h1> Heading 1 </h1>
    <h2> Heading 2 </h2>
    <h3> Heading 3 </h3>
    <h4> Heading 4 </h4>
    <h5> Heading 5 </h5>
    <h6> Heading 6 </h6> 
  </dd>
</dl>

---
## 6. Paragraph Tag.
```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Paragraph</title>
  </head>
  <body>
    <p>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </p>
  </body>
</html>
```
Output :-
---
<dl>
  <dd> 
    <p>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </p>
  </dd>
</dl> 

---
## 7. Pre Tag.
```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Pre</title>
  </head>
  <body>
    <pre>
      Lorem                  ipsum dolor sit amet, consectetur adipisicing elit. Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </pre>
  </body>
</html>
```
Output :-
---
<dl>
  <dd> 
    <p>
      Lorem &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp ipsum dolor sit amet, consectetur adipisicing elit. Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </p>
  </dd>
</dl> 

---
## 8. Attributes & Font Tag.
```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Headings & paragraph</title>
  </head>
  <body>
    <h1 align = "center"> Heading 1 </h1>
    <h2 align = "left"> Heading 2 </h2>
    <h3 align = "right"> Heading 3 </h3>
    <h4 align = "justify"> Heading 4 </h4>
    <p>
      Lorem ipsum <font size="6" color="red" face="Bradley Hand ITC">  dolor sit amet, consectetur adipisicing elit. </font> Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </p>
  </body>
</html>
```
Output :-
---
<dl>
  <dd> 
    <h1 align = "center"> Heading 1 </h1>
    <h2 align = "left"> Heading 2 </h2>
    <h3 align = "right"> Heading 3 </h3>
    <h4 align = "justify"> Heading 4 </h4>
    <p>
      Lorem ipsum <font size="6" color="red" face="Bradley Hand ITC">  dolor sit amet, consectetur adipisicing elit. </font> Nulla,
      necessitatibus autem praesentium repudiandae commodi, adipisci cum minus
      voluptatem fugiat aliquam ipsam, ducimus facilis fugit atque aspernatur
      aperiam? Provident, veniam ut?
    </p>
  </dd>
</dl> 

---
## 9. Subscript & Superscript Tag.
```HTML
<!DOCTYPE html>
<html>
  <head>
    <title>Sub & Sup</title>
  </head>
  <body>
    <h1>
      H <sub> 2 </sub> o
    </h1>
    <h1>
      12 <sup> th </sup>
    </h1>
  </body>
</html>
```
Output :-
---
<dl>
  <dd> 
    <h1>
      H <sub> 2 </sub> o
    </h1>
    <h1>
      12 <sup> th </sup>
    </h1>
  </dd>
</dl> 

---
## 10. Space, Break, Comment.
```HTML
&nbsp; (use for space)

<br>   (use for break a line or next line)   

<!-- Comment --> (use for comment, Comment is not show in Output)
```
