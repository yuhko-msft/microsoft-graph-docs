---
author: JeremyKelley
description: "This resource provides information on the status of a asynchronous job progress."
ms.date: 09/10/2017
title: asyncJobStatus
ms.localizationpriority: medium
doc_type: resourcePageType
ms.prod: ""
---

# asyncJobStatus resource

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Provides information on the status of a asynchronous job progress.

The following API calls return **asyncJobStatus** resources:

* [driveItem: copy](../api/driveitem-copy.md)

## Properties

| Property name          | Type   | Description                                                                                |
|:-----------------------|:-------|:-------------------------------------------------------------------------------------------|
| **percentageComplete** | Double | A value between 0 and 100 that indicates the percentage complete.                          |
| **status**             | String | A string value that maps to an enumeration of possible values about the status of the job. |

### status Meaning

| String value           | Description
|:-----------------------|:-------------------------------------------
| **notStarted**         | The work has been enqueued but not yet picked up.
| **inProgress**         | The work is being actively processed.
| **completed**          | The work has been completed.
| **failed**             | The work failed.
| **cancelled**          | The work was cancelled.
| **waiting**            | The work was interrupted, but will be tried again.
| **cancelPending**      | The work was cancelled, but processing has not yet aborted.

## JSON representation

<!-- { "blockType": "resource", "@type": "microsoft.graph.asyncJobStatus", "@type.aka": "oneDrive.asyncOperationStatus" } -->

```json
{
  "percentageComplete": 100.0,
  "status": "String"
}
```


<!--
{
  "type": "#page.annotation",
  "description": "AsyncJobResource provides details about how to poll for an async completion.",
  "keywords": "async,job status,async status,copy,upload from url",
  "section": "documentation",
  "suppressions": []
}
-->


