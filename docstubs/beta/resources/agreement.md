---
title: "agreement resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# agreement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                       | Return Type                                                             | Description                                                                   |
| :----------------------------------------------------------- | :---------------------------------------------------------------------- | :---------------------------------------------------------------------------- |
| [List agreement](../api/agreement-list.md)                   | [agreement](agreement.md) collection                                    | List properties and relationships of an agreement object.                     |
| [Create agreement](../api/agreement-create.md)               | [agreement](agreement.md)                                               | Create a new agreement object.                                                |
| [Get agreement](../api/agreement-get.md)                     | [agreement](agreement.md)                                               | Read properties and relationships of an agreement object.                     |
| [Update agreement](../api/agreement-update.md)               | [agreement](agreement.md)                                               | Update the properties of an agreement object.                                 |
| [Delete agreement](../api/agreement-delete.md)               |                                                                         | Delete an agreement object.                                                   |
| [List acceptances](../api/agreement-list-acceptances.md)     | [agreementAcceptance](../resources/-agreementacceptance.md)             | Get the agreementAcceptance objects from an acceptances navigation property.  |
| [Create acceptances](../api/agreement-post-acceptances.md)   | [agreementAcceptance](../resources/-agreementacceptance.md)             | Create a new agreementAcceptance object.                                      |
| [Get acceptances](../api/agreement-get-acceptances.md)       | [agreementAcceptance](../resources/-agreementacceptance.md)             | Read the properties and relationships of an agreementAcceptance object.       |
| [Update acceptances](../api/agreement-update-acceptances.md) | [agreementAcceptance](../resources/-agreementacceptance.md)             | Update the properties of an agreementAcceptance object.                       |
| [Delete acceptances](../api/agreement-delete-acceptances.md) |                                                                         | Delete an agreementAcceptance object.                                         |
| [List file](../api/agreement-list-file.md)                   | [agreementFile](../resources/-agreementfile.md)                         | Get the agreementFile objects from a file navigation property.                |
| [Create file](../api/agreement-post-file.md)                 | [agreementFile](../resources/-agreementfile.md)                         | Create a new agreementFile object.                                            |
| [Get file](../api/agreement-get-file.md)                     | [agreementFile](../resources/-agreementfile.md)                         | Read the properties and relationships of an agreementFile object.             |
| [Update file](../api/agreement-update-file.md)               | [agreementFile](../resources/-agreementfile.md)                         | Update the properties of an agreementFile object.                             |
| [Delete file](../api/agreement-delete-file.md)               |                                                                         | Delete an agreementFile object.                                               |
| [List files](../api/agreement-list-files.md)                 | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Get the agreementFileLocalization objects from a files navigation property.   |
| [Create files](../api/agreement-post-files.md)               | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Create a new agreementFileLocalization object.                                |
| [Get files](../api/agreement-get-files.md)                   | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Read the properties and relationships of an agreementFileLocalization object. |
| [Update files](../api/agreement-update-files.md)             | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Update the properties of an agreementFileLocalization object.                 |
| [Delete files](../api/agreement-delete-files.md)             |                                                                         | Delete an agreementFileLocalization object.                                   |

## Properties

| Property                          | Type                                               | Description |
| :-------------------------------- | :------------------------------------------------- | :---------- |
| displayName                       | String                                             |             |
| id                                | String                                             | Read-only.  |
| isPerDeviceAcceptanceRequired     | Boolean                                            |             |
| isViewingBeforeAcceptanceRequired | Boolean                                            |             |
| termsExpiration                   | [termsExpiration](../resources/termsexpiration.md) |             |
| userReacceptRequiredFrequency     | Duration                                           |             |

## Relationships

| Relationship | Type                                                                              | Description |
| :----------- | :-------------------------------------------------------------------------------- | :---------- |
| acceptances  | [agreementAcceptance](../resources/agreementacceptance.md) collection             |             |
| file         | [agreementFile](../resources/agreementfile.md)                                    |             |
| files        | [agreementFileLocalization](../resources/agreementfilelocalization.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.agreement",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.agreement",
  "displayName": "String",
  "id": "String (identifier)",
  "isPerDeviceAcceptanceRequired": "Boolean",
  "isViewingBeforeAcceptanceRequired": "Boolean",
  "termsExpiration": {"@odata.type": "microsoft.graph.termsExpiration"},
  "userReacceptRequiredFrequency": "Duration"
}
```
