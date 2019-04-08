<?php
  $dom = new DOMDocument();

  $dom->encoding = 'utf-8';
  $dom->xmlVersion = '1.0';
  $dom->formatOutput = true;

  $xml_file_name = 'customers.xml';

  $root = $dom->createElement('customers');

  $customers = $dom->createElement('customer');

  $name = $dom->createElement('name', $_POST['name']);
  $age = $dom->createElement('age', $_POST['age']);
  $city = $dom->createElement('city', $_POST['city']);

  $customers->appendChild($name);
  $customers->appendChild($age);
  $customers->appendChild($city);

  foreach ($_POST['languages'] as $select) {
    $x = $dom->createElement('language', $select);
    $customers->appendChild($x);
  }

  $root->appendChild($customers);

  $dom->appendChild($root);

  $dom->save($xml_file_name);

  echo "$xml_file_name has been saved";

 ?>
