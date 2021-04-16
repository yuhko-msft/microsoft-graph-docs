---
title: "accessPackageAssignmentPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageAssignmentPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List accessPackageAssignmentPolicies](../api/accesspackageassignmentpolicy-list.md)|[accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) collection|Get a list of the [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) objects and their properties.|
|[Create accessPackageAssignmentPolicy](../api/accesspackageassignmentpolicy-create.md)|[accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md)|Create a new [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.|
|[Get accessPackageAssignmentPolicy](../api/accesspackageassignmentpolicy-get.md)|[accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md)|Read the properties and relationships of an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.|
|[Update accessPackageAssignmentPolicy](../api/accesspackageassignmentpolicy-update.md)|[accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md)|Update the properties of an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.|
|[Delete accessPackageAssignmentPolicy](../api/accesspackageassignmentpolicy-delete.md)|None|Deletes an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.|
|[List accessPackage](../api/accesspackageassignmentpolicy-list-accesspackage.md)|[accessPackage](../resources/accesspackage.md) collection|Get the accessPackage resources from the accessPackage navigation property.|
|[Add accessPackage](../api/accesspackageassignmentpolicy-post-accesspackage.md)|[accessPackage](../resources/accesspackage.md)|Add accessPackage by posting to the accessPackage collection.|
|[List accessPackageCatalog](../api/accesspackageassignmentpolicy-list-accesspackagecatalog.md)|[accessPackageCatalog](../resources/accesspackagecatalog.md) collection|Get the accessPackageCatalog resources from the accessPackageCatalog navigation property.|
|[Create accessPackageCatalog](../api/accesspackageassignmentpolicy-post-accesspackagecatalog.md)|[accessPackageCatalog](../resources/accesspackagecatalog.md)|Create a new accessPackageCatalog object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessPackageId|String|**TODO: Add Description**|
|accessReviewSettings|[assignmentReviewSettings](../resources/assignmentreviewsettings.md)|**TODO: Add Description**|
|canExtend|Boolean|**TODO: Add Description**|
|createdBy|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|durationInDays|Int32|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|modifiedBy|String|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|questions|[accessPackageQuestion](../resources/accesspackagequestion.md) collection|**TODO: Add Description**|
|requestApprovalSettings|[approvalSettings](../resources/approvalsettings.md)|**TODO: Add Description**|
|requestorSettings|[requestorSettings](../resources/requestorsettings.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessPackage|[accessPackage](../resources/accesspackage.md)|**TODO: Add Description**|
|accessPackageCatalog|[accessPackageCatalog](../resources/accesspackagecatalog.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.accessPackageAssignmentPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentPolicy",
  "id": "String (identifier)",
  "accessPackageId": "String",
  "accessReviewSettings": {
    "@odata.type": "microsoft.graph.assignmentReviewSettings"
  },
  "canExtend": "Boolean",
  "createdBy": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "durationInDays": "Integer",
  "expirationDateTime": "String (timestamp)",
  "modifiedBy": "String",
  "modifiedDateTime": "String (timestamp)",
  "questions": [
    {
      "@odata.type": "microsoft.graph.accessPackageMultipleChoiceQuestion"
    }
  ],
  "requestApprovalSettings": {
    "@odata.type": "microsoft.graph.approvalSettings"
  },
  "requestorSettings": {
    "@odata.type": "microsoft.graph.requestorSettings"
  }
}
```

