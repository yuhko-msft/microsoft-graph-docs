---
title: "certificateAuthority resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# certificateAuthority resource type

Namespace: microsoft.graph

## Properties

| Property                          | Type    | Description |
| :-------------------------------- | :------ | :---------- |
| certificate                       | Binary  |             |
| certificateRevocationListUrl      | String  |             |
| deltaCertificateRevocationListUrl | String  |             |
| isRootAuthority                   | Boolean |             |
| issuer                            | String  |             |
| issuerSki                         | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.certificateAuthority",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.certificateAuthority",
  "certificate": "Binary",
  "certificateRevocationListUrl": "String",
  "deltaCertificateRevocationListUrl": "String",
  "isRootAuthority": "Boolean",
  "issuer": "String",
  "issuerSki": "String"
}
```
