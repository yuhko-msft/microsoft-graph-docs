---
title: "encryptWithUserDefinedRights resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# encryptWithUserDefinedRights resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                             | Type    | Description |
| :----------------------------------- | :------ | :---------- |
| allowAdHocPermissions                | Boolean |             |
| allowMailForwarding                  | Boolean |             |
| decryptionRightsManagementTemplateId | String  |             |
| encryptWith                          | String  |             |
| name                                 | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.encryptWithUserDefinedRights",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.encryptWithUserDefinedRights",
  "allowAdHocPermissions": "Boolean",
  "allowMailForwarding": "Boolean",
  "decryptionRightsManagementTemplateId": "String",
  "encryptWith": "template | userDefinedRights",
  "name": "String"
}
```
